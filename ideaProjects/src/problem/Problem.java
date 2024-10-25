package problem;



    public class Problem {
        private Type types;
        private String name;
        private String isSolved;
        public Problem(Type type, String name, String isSolved) {
            this.types = type;
            this.name = name;
            this.isSolved = isSolved;

        }
        public Problem(Type type,String problemName) {
            this.types = type;
            this.name = problemName;
        }

        public void setName(String name) {
            if(!name.matches("[a-zA-Z]+")){
                throw new  IllegalArgumentException("enter only letters");
            }
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setType(Type problemType) {

            this.types = problemType;
        }
        public Type getType() {
            return types;
        }
        public boolean setIsSolved(String isSolved) {
            this.isSolved = isSolved;
            if(isSolved == "yes"){
                return true;
            }
            return false;
        }
        public problem.Problem addProblem(String name, Type types) {

            this.types = types;
            this.name = name;
            return this;
        }
    }


