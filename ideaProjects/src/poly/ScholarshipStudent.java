package poly;




    public class ScholarshipStudent extends Student {
        private String name;
        private int age;
        private String scholarshipStatus;

        public ScholarshipStudent(String name, int age, String scholarshipStatus) {
            super(name, age, scholarshipStatus);
            this.name = name;
            this.age = age;
            this.scholarshipStatus = scholarshipStatus;

        }
        public String getName() {
            return name;
        }
        public void getScholarshipStatus(String Status) {
            scholarshipStatus = Status;

        }
        public int getAge() {
            return age;
        }

        @Override
        public String paySchoolFees() {
            return "your percentage of scholarship is :" + scholarshipStatus;
        }
        @Override
        public String toString() {
            return String.format("Student name: %s%n Student age: %d%n Student SchorlarshipStatus %s%n Payment Status %s", name, age, scholarshipStatus,paySchoolFees());

        }
    }


