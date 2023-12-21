// generated with ast extension for cup
// version 0.8
// 21/11/2023 14:18:55


package rs.ac.bg.etf.pp1.ast;

public class Terms extends Term {

    private Factor Factor;
    private MulopFOpt MulopFOpt;

    public Terms (Factor Factor, MulopFOpt MulopFOpt) {
        this.Factor=Factor;
        if(Factor!=null) Factor.setParent(this);
        this.MulopFOpt=MulopFOpt;
        if(MulopFOpt!=null) MulopFOpt.setParent(this);
    }

    public Factor getFactor() {
        return Factor;
    }

    public void setFactor(Factor Factor) {
        this.Factor=Factor;
    }

    public MulopFOpt getMulopFOpt() {
        return MulopFOpt;
    }

    public void setMulopFOpt(MulopFOpt MulopFOpt) {
        this.MulopFOpt=MulopFOpt;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Factor!=null) Factor.accept(visitor);
        if(MulopFOpt!=null) MulopFOpt.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Factor!=null) Factor.traverseTopDown(visitor);
        if(MulopFOpt!=null) MulopFOpt.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Factor!=null) Factor.traverseBottomUp(visitor);
        if(MulopFOpt!=null) MulopFOpt.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("Terms(\n");

        if(Factor!=null)
            buffer.append(Factor.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MulopFOpt!=null)
            buffer.append(MulopFOpt.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [Terms]");
        return buffer.toString();
    }
}
