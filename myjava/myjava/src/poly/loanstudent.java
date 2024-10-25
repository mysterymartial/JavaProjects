package poly;


    public class loanstudent extends Student {
        private String name;
        private int age;
        private String gender;
        private String matricNumber;
        public loanstudent(String name, int age, String gender, String matricNumber) {
            super(name,age,matricNumber);
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.matricNumber = matricNumber;
        }

        @Override
        public int getAge(int age) {
            return age;
        }

        @Override
        public String getName(String name) {
            return name;
        }

        @Override
        public String paySchoolFees() {
            return " you pay installmentally";
        }

        @Override
        public String toString() {
            return String.format("Student name:%s%n Student age %d%n Student gender%s%n Student matric number%s%n",name,age,gender,matricNumber);
        }
    }


