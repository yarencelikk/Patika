import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

    private String[][] board;      // Oyuncuya gösterilen tablo ("-","0","1",...)
    private String[][] mineBoard;  // Mayınların konumu ("*","-")
    private int rowCount;
    private int colCount;
    private int mineCount;
    private int openCells;

    public MineSweeper(int rows, int cols) {
        this.rowCount = rows;
        this.colCount = cols;
        this.mineCount = (rows * cols) / 4;
        this.board = new String[rows][cols];
        this.mineBoard = new String[rows][cols];
        this.openCells = 0;

        initBoards();
        placeMines();
    }

    private void initBoards() {
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                board[i][j] = "-";
                mineBoard[i][j] = "-";
            }
        }
    }

    private void placeMines() {
        Random rand = new Random();
        int placedMines = 0;

        while (placedMines < mineCount) {
            int r = rand.nextInt(rowCount);
            int c = rand.nextInt(colCount);

            if (!mineBoard[r][c].equals("*")) {
                mineBoard[r][c] = "*";
                placedMines++;
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Kullanıcının seçtiği hücreyi açar
    public boolean openCell(int row, int col) {
        if (!isValidCell(row, col)) {
            System.out.println("Geçersiz koordinat, tekrar deneyin.");
            return true; // Oyunu sonlandırma, yeniden iste
        }
        if (!board[row][col].equals("-")) {
            System.out.println("Bu koordinat daha önce seçildi, başka koordinat girin.");
            return true;
        }
        if (mineBoard[row][col].equals("*")) {
            // Mayına basıldı, kaybetti
            return false;
        }
        // Mayın yok, etrafındaki mayın sayısını yaz
        int minesAround = countMinesAround(row, col);
        board[row][col] = String.valueOf(minesAround);
        openCells++;

        // Eğer çevresinde mayın yoksa (0 ise) komşuları otomatik aç
        if (minesAround == 0) {
            openAdjacentCells(row, col);
        }
        return true;
    }

    private void openAdjacentCells(int row, int col) {
        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                if (isValidCell(i, j) && board[i][j].equals("-") && !mineBoard[i][j].equals("*")) {
                    int minesAround = countMinesAround(i, j);
                    board[i][j] = String.valueOf(minesAround);
                    openCells++;
                    if (minesAround == 0) {
                        openAdjacentCells(i, j);
                    }
                }
            }
        }
    }

    private int countMinesAround(int row, int col) {
        int count = 0;
        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                if (isValidCell(i, j) && mineBoard[i][j].equals("*")) {
                    count++;
                }
            }
        }
        return count;
    }

    private boolean isValidCell(int row, int col) {
        return row >= 0 && row < rowCount && col >= 0 && col < colCount;
    }

    // Oyuncu kazandı mı kontrolü (mayına basmadan tüm hücreler açıldı mı)
    public boolean isWin() {
        return openCells == (rowCount * colCount - mineCount);
    }

    // Mayınların yerini göster (kaybedince)
    public void showMines() {
        System.out.println("Mayınların Konumu:");
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                if (mineBoard[i][j].equals("*")) {
                    System.out.print("* ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }

    // Main metodu oyun döngüsü ile
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows, cols;
        do {
            System.out.print("Satır sayısını giriniz (min 2): ");
            rows = scanner.nextInt();
            System.out.print("Sütun sayısını giriniz (min 2): ");
            cols = scanner.nextInt();

            if (rows < 2 || cols < 2) {
                System.out.println("Matris boyutu en az 2x2 olmalıdır! Tekrar deneyin.");
            }
        } while (rows < 2 || cols < 2);

        MineSweeper game = new MineSweeper(rows, cols);

        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz !");
        game.printBoard();

        while (true) {
            System.out.print("Satır Giriniz : ");
            int r = scanner.nextInt();
            System.out.print("Sütun Giriniz : ");
            int c = scanner.nextInt();

            if (!game.isValidCell(r, c)) {
                System.out.println("Geçersiz koordinat, tekrar deneyin.");
                continue;
            }

            boolean alive = game.openCell(r, c);
            if (!alive) {
                System.out.println("Game Over!!");
                game.showMines();
                break;
            }

            game.printBoard();

            if (game.isWin()) {
                System.out.println("Oyunu Kazandınız !");
                game.printBoard();
                break;
            }
        }

        scanner.close();
    }
}
