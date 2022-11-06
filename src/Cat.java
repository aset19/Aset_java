
    public  class Cat{
            private String name;
            private int growth;
            private int weight;
            private int country;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getGrowth() {
                return growth;
            }

            public void setGrowth(int growth) {
                this.growth = growth;
            }

            public int getWeight() {
                return weight;
            }

            public void setWeight(int weight) {
                this.weight = weight;
            }

            public int getCountry() {
                return country;
            }
        @Override
        public String toString() {
            return  "name='" + name + '\n' +
                    "growth=" + growth + '\n' +
                    "weight=" + weight + '\n' +
                    "country=" + country + '\n';
            }

            public void setCountry(int country) {
                this.country = country;
                switch (country){
                    case 1:
                        System.out.println( "Country" + " Россия");
                        break;
                    case 2:
                        System.out.println("Country" + " Канада");
                        break;
                    case 3:
                        System.out.println("Country"+ " Египет");
                        break;
                    default:
                        System.out.println("ХЗ откуда");

                }
            }
            }


