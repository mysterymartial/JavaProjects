package poly;



    public abstract class Student {
        private String name;
        private int age;
        private String matricNumber;
        public Student(String name, int age,  String matricNumber) {
            this.name = name;
            this.age = age;
            this.matricNumber = matricNumber;
        }
        public String getName(String name) {
            return name;
        }
        public int getAge(int age) {
            return age;
        }
        public String paySchoolFees() {
            return "School fees paid before starting the term";
        }

        @Override
        public String toString() {
            return String.format("Student name is :%s%n Student age is %d%n fees basics%s%n",name,age,paySchoolFees());
        }
    }


