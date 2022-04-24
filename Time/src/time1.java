public class time1 {

        private int hourse;
        private int minute;
        private int second;

        //time()
        public  time1(int hourse, int minute, int second){
            this.hourse = hourse;
            this.minute = minute;
            this.second = second;
        }

        // void setTime()
        public void setTime(int hourse,int minute, int second){
            this.hourse = hourse;
            this.minute = minute;
            this.second = second;
        }
        //toString()
        public String toString(){
            return (this.hourse+":"+this.minute+":"+this.second);
        }

        // nextSecond
        public void nextSecond(){
            this.second= second+1;
        }
        public void previousSecond(){
            this.second = second-1;
        }
        //setter
        public void setHourse(int hourse){
            this.hourse = hourse;
        }
        public void setMinute(int minute){
            this.minute = minute;
        }
        public void setSecond(int second){
            this.second = second;
        }

        //getter
        public int getHourse(){
            return hourse;
        }
        public int getMinute(){
            return minute;
        }
        public int getSecond(){
            return second;
        }
    }
