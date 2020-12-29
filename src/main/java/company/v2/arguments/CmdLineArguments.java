package company.v2.arguments;

public class CmdLineArguments implements Arguments {
    private String[] args;

    public CmdLineArguments(String[] args) {
        this.args = args;
    }

    @Override
    public String getOperation() {
        //Add validations here
        return args[0];
    }
}
