package util;

public enum ConsoleColors {
    RED("\u001B[31m") {
        @Override
        public void print(String text) {
            System.out.println(getAnsiColor() + text + getAnsiReset());
        }
    }, YELLOW("\u001B[33m") {
        @Override
        public void print(String text) {
            System.out.println(getAnsiColor() + text + getAnsiReset());
        }
    }, BLUE("\u001B[34m") {
        @Override
        public void print(String text) {
            System.out.println(getAnsiColor() + text + getAnsiReset());
        }
    }, PURPLE("\u001B[35m") {
        @Override
        public void print(String text) {
            System.out.println(getAnsiColor() + text + getAnsiReset());
        }
    }, CYAN("\u001B[36m") {
        @Override
        public void print(String text) {
            System.out.println(getAnsiColor() + text + getAnsiReset());
        }
    };

    private String ansiColor;

    ConsoleColors(String ansiColor) {
        this.ansiColor = ansiColor;
    }

    public String getAnsiColor() {
        return ansiColor;
    }

    protected String getAnsiReset() {
        return "\u001B[0m";
    }

    public abstract void print(String text);
}
