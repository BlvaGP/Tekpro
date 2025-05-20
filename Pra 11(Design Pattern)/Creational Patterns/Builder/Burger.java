public class Burger {
    private String breadSize;
    private String meatType;
    private boolean hasLettuce;
    private boolean hasTomato;
    private String sauce;

    private Burger(Builder builder) {
        this.breadSize = builder.breadSize;
        this.meatType = builder.meatType;
        this.hasLettuce = builder.hasLettuce;
        this.hasTomato = builder.hasTomato;
        this.sauce = builder.sauce;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "breadSize='" + breadSize + '\'' +
                ", meatType='" + meatType + '\'' +
                ", hasLettuce=" + hasLettuce +
                ", hasTomato=" + hasTomato +
                ", sauce='" + sauce + '\'' +
                '}';
    }

    public static class Builder {
        private String breadSize;
        private String meatType;
        private boolean hasLettuce;
        private boolean hasTomato;
        private String sauce;

        public Builder(String breadSize, String meatType) {
            this.breadSize = breadSize;
            this.meatType = meatType;
        }

        public Builder addLettuce(boolean hasLettuce) {
            this.hasLettuce = hasLettuce;
            return this;
        }

        public Builder addTomato(boolean hasTomato) {
            this.hasTomato = hasTomato;
            return this;
        }

        public Builder addSauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public Burger build() {
            return new Burger(this);
        }
    }
}