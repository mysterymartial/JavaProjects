package problem;

import java.util.ArrayList;



import java.util.ArrayList;

    public class Person {
        private ArrayList<Problem> probsList = new ArrayList<>();
        private ArrayList<Problem> solvedProbsList = new ArrayList<>();
        private boolean status;

        public Problem addProblem(String nameOfProblem,Type problemType) {
            Problem problem = new Problem(problemType,nameOfProblem);
            probsList.add(problem);
            return problem;

        }
        public int size(){
            return probsList.size();
        }

        public Problem solve(String nameOfProblem, Type type, String status) {
            Problem solvedProblem = solve(nameOfProblem,type,status);
            solvedProbsList.add(solvedProblem);
            return solvedProblem;


        }
        public int solvedSize(){return solvedProbsList.size();}
    }


