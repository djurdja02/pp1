// generated with ast extension for cup
// version 0.8
// 21/11/2023 14:18:55


package rs.ac.bg.etf.pp1.ast;

public class DesigRepYes extends DesigRep {

    private DesigRep DesigRep;
    private DesigRepChoose DesigRepChoose;

    public DesigRepYes (DesigRep DesigRep, DesigRepChoose DesigRepChoose) {
        this.DesigRep=DesigRep;
        if(DesigRep!=null) DesigRep.setParent(this);
        this.DesigRepChoose=DesigRepChoose;
        if(DesigRepChoose!=null) DesigRepChoose.setParent(this);
    }

    public DesigRep getDesigRep() {
        return DesigRep;
    }

    public void setDesigRep(DesigRep DesigRep) {
        this.DesigRep=DesigRep;
    }

    public DesigRepChoose getDesigRepChoose() {
        return DesigRepChoose;
    }

    public void setDesigRepChoose(DesigRepChoose DesigRepChoose) {
        this.DesigRepChoose=DesigRepChoose;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(DesigRep!=null) DesigRep.accept(visitor);
        if(DesigRepChoose!=null) DesigRepChoose.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(DesigRep!=null) DesigRep.traverseTopDown(visitor);
        if(DesigRepChoose!=null) DesigRepChoose.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(DesigRep!=null) DesigRep.traverseBottomUp(visitor);
        if(DesigRepChoose!=null) DesigRepChoose.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("DesigRepYes(\n");

        if(DesigRep!=null)
            buffer.append(DesigRep.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(DesigRepChoose!=null)
            buffer.append(DesigRepChoose.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [DesigRepYes]");
        return buffer.toString();
    }
}
