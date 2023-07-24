package HangsmanGame;

public enum Scaffold {
    ZERO {
        @Override
        public String toString() {
            return """
                    -----------
                    |         |
                    |         |
                    |        
                    |
                    |
                    |
                    |
                    |""";
        }
    },
    ONE {
        @Override
        public String toString() {
            return """
                    -----------
                    |         |
                    |         |
                    |        ( )        
                    |
                    |
                    |
                    |
                    |""";
        }
    },
    TWO {
        @Override
        public String toString() {
            return """
                    -----------
                    |         |
                    |         |
                    |        ( )
                    |         |
                    |         |
                    |
                    |
                    |""";
        }
    },
    THREE {
        @Override
        public String toString() {
            return """
                    -----------
                    |         |
                    |         |
                    |        ( )/
                    |         |/
                    |         |
                    |
                    |
                    |""";
        }
    },
    FOUR {
        @Override
        public String toString() {
            return """
                    -----------
                    |         |
                    |         |
                    |       \\( )/
                    |        \\|/
                    |         |
                    |
                    |
                    |""";
        }

    },
    FIVE {
        @Override
        public String toString() {
            return """
                    -----------
                    |         |
                    |         |
                    |       \\( )/
                    |        \\|/
                    |         |
                    |        /
                    |       /
                    |""";
        }
    },

    SIX {
        @Override
        public String toString() {
            return """
                    -----------
                    |         |
                    |         |
                    |       \\( )/
                    |        \\|/
                    |         |
                    |        / \\
                    |       /   \\
                    |""";
        }
    }
}


