package pl.art.tutorial.pattern.hallo;

import java.util.List;

public class ProgramArgument {

    private final boolean interactive;
    private final String userName;
    private final boolean loop;
    private final String color;

    public String getUserName() {
        return userName;
    }

    public boolean isInteractive() {
        return interactive;
    }

    public boolean isLoop() {
        return loop;
    }

    public String getColor() {
        return color;
    }

    public ProgramArgument(boolean interactive, String userName, boolean loop, String color) {
        this.interactive = interactive;
        this.userName = userName;
        this.loop = loop;
        this.color = color;
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder {

        private String userName;
        private boolean interactive;
        private boolean loop;
        private String color;

        // potrzebujemy przetworzyć parametry programu
        public Builder setArgs(List<String> args) {

            if(args.size() >= 2 && "-name".equals(args.get(0))){
                userName = args.get(1);

            } else if (args.size() > 1 && "-i".equals(args.get(0))){
                interactive = true;

            } else if(args.size() > 1 && "-loop".equals(args.get(0))){
                interactive = true;
                loop = true;
            }

            if(args.contains("-color")){
                color = args.get(args.indexOf("-color") + 1);
            }

            return this;
        }

        public ProgramArgument build() {
            return new ProgramArgument(interactive, userName, loop, color);
        }
    }
}
