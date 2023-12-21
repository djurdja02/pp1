// generated with ast extension for cup
// version 0.8
// 21/11/2023 14:18:54


package rs.ac.bg.etf.pp1.ast;

public class MthodDecl extends MethodDecl {

    private TypeList TypeList;
    private String I2;
    private FormList FormList;
    private VarDeclList VarDeclList;
    private StateL StateL;

    public MthodDecl (TypeList TypeList, String I2, FormList FormList, VarDeclList VarDeclList, StateL StateL) {
        this.TypeList=TypeList;
        if(TypeList!=null) TypeList.setParent(this);
        this.I2=I2;
        this.FormList=FormList;
        if(FormList!=null) FormList.setParent(this);
        this.VarDeclList=VarDeclList;
        if(VarDeclList!=null) VarDeclList.setParent(this);
        this.StateL=StateL;
        if(StateL!=null) StateL.setParent(this);
    }

    public TypeList getTypeList() {
        return TypeList;
    }

    public void setTypeList(TypeList TypeList) {
        this.TypeList=TypeList;
    }

    public String getI2() {
        return I2;
    }

    public void setI2(String I2) {
        this.I2=I2;
    }

    public FormList getFormList() {
        return FormList;
    }

    public void setFormList(FormList FormList) {
        this.FormList=FormList;
    }

    public VarDeclList getVarDeclList() {
        return VarDeclList;
    }

    public void setVarDeclList(VarDeclList VarDeclList) {
        this.VarDeclList=VarDeclList;
    }

    public StateL getStateL() {
        return StateL;
    }

    public void setStateL(StateL StateL) {
        this.StateL=StateL;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(TypeList!=null) TypeList.accept(visitor);
        if(FormList!=null) FormList.accept(visitor);
        if(VarDeclList!=null) VarDeclList.accept(visitor);
        if(StateL!=null) StateL.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(TypeList!=null) TypeList.traverseTopDown(visitor);
        if(FormList!=null) FormList.traverseTopDown(visitor);
        if(VarDeclList!=null) VarDeclList.traverseTopDown(visitor);
        if(StateL!=null) StateL.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(TypeList!=null) TypeList.traverseBottomUp(visitor);
        if(FormList!=null) FormList.traverseBottomUp(visitor);
        if(VarDeclList!=null) VarDeclList.traverseBottomUp(visitor);
        if(StateL!=null) StateL.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MthodDecl(\n");

        if(TypeList!=null)
            buffer.append(TypeList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(" "+tab+I2);
        buffer.append("\n");

        if(FormList!=null)
            buffer.append(FormList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(VarDeclList!=null)
            buffer.append(VarDeclList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(StateL!=null)
            buffer.append(StateL.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MthodDecl]");
        return buffer.toString();
    }
}
