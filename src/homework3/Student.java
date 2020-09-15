package homework3;

public abstract class Student {
    String firstName, lastName, group,sum;
    static double averageMark;

        public abstract String getScholarship();  {
            if (this.averageMark == 5) {
                sum = "100";
                //return this.sum;
            }
            //return this.
                    sum = "80";
        }

}

abstract class Aspirant extends Student{
        public abstract String getScholarship();{
            if (averageMark == 5){
                sum =  "200";
            }
        sum =  "180";
        }

}