package pl.art.tutorial.pattern.hallo;

import java.util.List;

public class ProgramArgument {

    private final boolean interactive;
    private final String userName;
    private final boolean loop;

    public String getUserName() {
        return userName;
    }

    public boolean isInteractive() {
        return interactive;
    }

    public boolean isLoop() {
        return loop;
    }

    public ProgramArgument(boolean interactive, String userName, boolean loop) {
        this.interactive = interactive;
        this.userName = userName;
        this.loop = loop;
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder {

        private String userName;
        private boolean interactive;
        private boolean loop;

        // potrzebujemy przetworzyć parametry programu
        public Builder setArgs(List<String> args) {

            if(args.size() == 2 && "-name".equals(args.get(0))){
                userName = args.get(1);

            } else if (args.size() == 1 && "-i".equals(args.get(0))){
                interactive = true;

            } else if(args.size() == 1 && "-loop".equals(args.get(0))){
                interactive = true;
                loop = true;
            }

            return this;
        }

        public ProgramArgument build() {
            return new ProgramArgument(interactive, userName, loop);
        }
    }
}
