// generated with ast extension for cup
// version 0.8
// 21/11/2023 14:18:54


package rs.ac.bg.etf.pp1.ast;

public class DclVarClass extends Decl {

    private VarD VarD;

    public DclVarClass (VarD VarD) {
        this.VarD=VarD;
        if(VarD!=null) VarD.setParent(this);
    }

    public VarD getVarD() {
        return VarD;
    }

    public void setVarD(VarD VarD) {
        this.VarD=VarD;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(VarD!=null) VarD.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(VarD!=null) VarD.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(VarD!=null) VarD.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("DclVarClass(\n");

        if(VarD!=null)
            buffer.append(VarD.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [DclVarClass]");
        return buffer.toString();
    }
}
