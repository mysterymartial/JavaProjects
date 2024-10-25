package survey;



    public class Survey {
        private final int [][] responses= new int[5][10];
        private final String [] questions = {"social","finacial","spritual","academical","mental"};

        public int topics_length(){
            return questions.length;
        }

        public String issues(String index) {
            return questions[Integer.parseInt(index)];
        }

        public int [] responses_length() {
            int coloumn = responses.length;
            int row = responses[0].length;

            return new int[]{coloumn,row};
        }


        public int getTable(int issues, int rate) {
            return responses[issues-1][rate-1];

        }
        public void increasRating(int issues, int rate) {
            int counting = responses[issues-1][rate-1]++;
        }


    }



