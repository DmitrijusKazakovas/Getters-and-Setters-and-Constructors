package GSC;

public class dogs {
        private String name = "unknown";
        private String breed = "unknown";
        //constructor
        public dogs (String newName, String newBreed) {
            name = newName;
            breed = newBreed;
        }
        // public dogs (String newBreed) { //neleidzia overloadint
        //     breed = newBreed;
        // }

        //2 getters and setters
        public void setName(String newName) {
            name = newName;
        }
        public String getName() {
            return name;
        }
        public void setBreed(String newBreed) {
            breed = newBreed;
        }
        public String getBreed(){
            return breed;
        }
        public void dogDisplay() {
            System.out.println("Name:" + getName());
            System.out.println("Breed:" + getBreed());
        }
}

