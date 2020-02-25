package canban.model;

public enum taskPriority{
    LOW{
        @Override
        public String toString(){return "LOW";}
    },
    NORMAL{
        @Override
        public String toString(){return "NORMAL";}
    },
    HIGH{
        @Override
        public String toString(){return "HIGH";}
    }
}
