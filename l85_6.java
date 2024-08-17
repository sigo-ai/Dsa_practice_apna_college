public class l85_6 {
        public static void main(String[] args) {
            int i=0;
            while(i<5){
                System.out.println("hiiii");
                if(i==4){
                    try{
                        break;
                    }
                    finally{
                        System.out.println("nothing can stop me");
                    }
                }

                i++;
            }
        }

}
