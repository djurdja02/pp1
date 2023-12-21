// generated with ast extension for cup
// version 0.8
// 21/11/2023 14:18:55


package rs.ac.bg.etf.pp1.ast;

public class DesignatorYes extends Designator {

    private String I1;
    private IdenL IdenL;
    private DesigRep DesigRep;

    public DesignatorYes (String I1, IdenL IdenL, DesigRep DesigRep) {
        this.I1=I1;
        this.IdenL=IdenL;
        if(IdenL!=null) IdenL.setParent(this);
        this.DesigRep=DesigRep;
        if(DesigRep!=null) DesigRep.setParent(this);
    }

    public String getI1() {
        return I1;
    }

    public void setI1(String I1) {
        this.I1=I1;
    }

    public IdenL getIdenL() {
        return IdenL;
    }

    public void setIdenL(IdenL IdenL) {
        this.IdenL=IdenL;
    }

    public DesigRep getDesigRep() {
        return DesigRep;
    }

    public void setDesigRep(DesigRep DesigRep) {
        this.DesigRep=DesigRep;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(IdenL!=null) IdenL.accept(visitor);
        if(DesigRep!=null) DesigRep.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(IdenL!=null) IdenL.traverseTopDown(visitor);
        if(DesigRep!=null) DesigRep.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(IdenL!=null) IdenL.traverseBottomUp(visitor);
        if(DesigRep!=null) DesigRep.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("DesignatorYes(\n");

        buffer.append(" "+tab+I1);
        buffer.append("\n");

        if(IdenL!=null)
            buffer.append(IdenL.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(DesigRep!=null)
            buffer.append(DesigRep.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [DesignatorYes]");
        return buffer.toString();
    }
}
