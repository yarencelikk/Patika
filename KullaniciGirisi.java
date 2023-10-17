import java.util.Scanner;
    public class KullaniciGirisi {
        public static void main(String[] args) {
            String userName, password,newPassword;
                 int select;
            Scanner input = new Scanner(System.in);

            System.out.print("Kullanıcı Adını Giriniz: ");
            userName = input.nextLine();
            System.out.print("Kullacı Şifrenizi Giriniz: ");
            password = input.nextLine();

            if (userName.equals("path") && password.equals("path123")) {
                System.out.print("Giriş Başarılı !!");

            } else if(!(userName.equals("path")) && !(password.equals("path123"))){
                System.out.print("Lütfen bilgilerinizi kontrol edip tekrar deneyiniz.");

            } else if (!(userName.equals("path")) && (password.equals("path123"))) {
                System.out.print("Kullanıcı adı hatalı lütfen Kullanıcı adını kontrol edip tekrar deneyiniz.");

            } else if(userName.equals("path") && !(password.equals("path123"))) {
                System.out.println("Hatalı Şifre!!!");
                System.out.println("Şifrenizi unuttuysanız adımları takip edin\n Yeni şifre oluşturmak için : '1' .\n Yeni Şifre oluşturmaktan vazgeçmek ve giriş ekranından ayrılmak için:'2'.");
                System.out.print(" Seçiminiz: ");
                select = input.nextInt();

                switch (select) {
                    case 1 -> {
                        System.out.print("Yeni şifre giriniz.(Lütfen daha önceki şifrelerinizden farklı bir şifre oluşturunuz:");
                        newPassword = input.nextLine();
                        input.nextLine();
                        if (!newPassword.equals("path123")) {
                            System.out.println("Yeni şifreniz başarı ile oluşturuldu.");

                        } else {
                            System.out.print("Hatalı deneme!Yeni şifre eskisiyle aynı olamaz. Tekrar Deneyiniz");
                        }
                    }
                    case 2 -> System.out.print("Giriş ekranına yönlendiriliyorsunuz");
                    default ->
                            System.out.print("Hatalı giriş yaptınız! Lütfen sadece '1 ve 2' seçeneklerinden birini giriniz.");
                }
            }

        }
    }