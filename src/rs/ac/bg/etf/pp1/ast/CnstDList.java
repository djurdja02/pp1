// generated with ast extension for cup
// version 0.8
// 21/11/2023 14:18:54


package rs.ac.bg.etf.pp1.ast;

public class CnstDList extends ConstDList {

    private ConstDList ConstDList;
    private String I2;
    private Constant Constant;

    public CnstDList (ConstDList ConstDList, String I2, Constant Constant) {
        this.ConstDList=ConstDList;
        if(ConstDList!=null) ConstDList.setParent(this);
        this.I2=I2;
        this.Constant=Constant;
        if(Constant!=null) Constant.setParent(this);
    }

    public ConstDList getConstDList() {
        return ConstDList;
    }

    public void setConstDList(ConstDList ConstDList) {
        this.ConstDList=ConstDList;
    }

    public String getI2() {
        return I2;
    }

    public void setI2(String I2) {
        this.I2=I2;
    }

    public Constant getConstant() {
        return Constant;
    }

    public void setConstant(Constant Constant) {
        this.Constant=Constant;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ConstDList!=null) ConstDList.accept(visitor);
        if(Constant!=null) Constant.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ConstDList!=null) ConstDList.traverseTopDown(visitor);
        if(Constant!=null) Constant.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ConstDList!=null) ConstDList.traverseBottomUp(visitor);
        if(Constant!=null) Constant.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("CnstDList(\n");

        if(ConstDList!=null)
            buffer.append(ConstDList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(" "+tab+I2);
        buffer.append("\n");

        if(Constant!=null)
            buffer.append(Constant.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [CnstDList]");
        return buffer.toString();
    }
}
