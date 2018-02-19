package creational.builder;

public class Burger {

    private boolean cheese;
    private boolean tomato;
    private boolean bread;

    private Burger(boolean cheese, boolean tomato, boolean bread) {
        this.cheese = cheese;
        this.tomato = tomato;
        this.bread = bread;
    }

    public static class BurgerBuilder {

        private boolean cheese;
        private boolean tomato;
        private boolean bread;

        public BurgerBuilder addCheese(boolean cheese) {
            this.cheese = cheese;
            return this;
        }

        public BurgerBuilder addTomato(boolean tomato) {
            this.tomato = tomato;
            return this;
        }

        public BurgerBuilder addBread(boolean bread) {
            this.bread = bread;
            return this;
        }

        public Burger build() {
            return new Burger(cheese, tomato, bread);
        }
    }
}
