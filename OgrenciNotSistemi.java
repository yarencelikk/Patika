class Teacher {
    String name;
    String mpno;
    String branch;

    public Teacher(String name, String mpno, String branch) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }
}

class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int examNote;       // Sınav notu
    int oralNote;       // Sözlü notu
    double oralWeight;  // Sözlü notunun ortalamaya etkisi (0-1 arası)

    public Course(String name, String code, String prefix, double oralWeight) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.oralWeight = oralWeight;
        this.examNote = 0;
        this.oralNote = 0;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }

    // Ağırlıklı ortalamayı hesaplar
    public double calcCourseAverage() {
        return (examNote * (1 - oralWeight)) + (oralNote * oralWeight);
    }
}

class Student {
    String name, stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double average;
    boolean isPass;

    public Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.average = 0.0;
        this.isPass = false;
    }

    // Sınav ve sözlü notlarını topluca atar
    public void addBulkExamNote(int matExam, int matOral, int fizikExam, int fizikOral, int kimyaExam, int kimyaOral) {
        if (matExam >= 0 && matExam <= 100)
            this.mat.examNote = matExam;
        if (matOral >= 0 && matOral <= 100)
            this.mat.oralNote = matOral;

        if (fizikExam >= 0 && fizikExam <= 100)
            this.fizik.examNote = fizikExam;
        if (fizikOral >= 0 && fizikOral <= 100)
            this.fizik.oralNote = fizikOral;

        if (kimyaExam >= 0 && kimyaExam <= 100)
            this.kimya.examNote = kimyaExam;
        if (kimyaOral >= 0 && kimyaOral <= 100)
            this.kimya.oralNote = kimyaOral;
    }

    // Geçme durumunu ve ortalamayı hesaplar
    public void isPass() {
        if (mat.examNote == 0 || fizik.examNote == 0 || kimya.examNote == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + String.format("%.2f", this.average));
            if (this.isPass) {
                System.out.println("Sınıfı Geçti.");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAverage() {
        this.average = (mat.calcCourseAverage() + fizik.calcCourseAverage() + kimya.calcCourseAverage()) / 3.0;
    }

    public boolean isCheckPass() {
        calcAverage();
        return this.average > 55;
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : Sınav = " + mat.examNote + ", Sözlü = " + mat.oralNote + ", Ortalama = " + String.format("%.2f", mat.calcCourseAverage()));
        System.out.println("Fizik Notu : Sınav = " + fizik.examNote + ", Sözlü = " + fizik.oralNote + ", Ortalama = " + String.format("%.2f", fizik.calcCourseAverage()));
        System.out.println("Kimya Notu : Sınav = " + kimya.examNote + ", Sözlü = " + kimya.oralNote + ", Ortalama = " + String.format("%.2f", kimya.calcCourseAverage()));
    }
}

public class OgrenciNotSistemi {
    public static void main(String[] args) {

        // Dersleri oluştururken sözlü notunun ortalamaya etkisini belirtiyoruz
        Course mat = new Course("Matematik", "MAT101", "MAT", 0.3);  // %30 sözlü ağırlığı
        Course fizik = new Course("Fizik", "FZK101", "FZK", 0.2);    // %20 sözlü ağırlığı
        Course kimya = new Course("Kimya", "KMY101", "KMY", 0.25);   // %25 sözlü ağırlığı

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", 4, "140144015", mat, fizik, kimya);
        // Sınav ve sözlü notlarını birlikte giriyoruz
        s1.addBulkExamNote(50, 90, 20, 60, 40, 80);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "2211133", mat, fizik, kimya);
        s2.addBulkExamNote(100, 70, 50, 80, 40, 60);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "221121312", mat, fizik, kimya);
        s3.addBulkExamNote(50, 50, 20, 30, 40, 40);
        s3.isPass();

    }
}
