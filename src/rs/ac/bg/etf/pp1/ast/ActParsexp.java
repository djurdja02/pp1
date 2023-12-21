// generated with ast extension for cup
// version 0.8
// 21/11/2023 14:18:55


package rs.ac.bg.etf.pp1.ast;

public class ActParsexp extends ActPars {

    private Expr Expr;
    private ExprComma ExprComma;

    public ActParsexp (Expr Expr, ExprComma ExprComma) {
        this.Expr=Expr;
        if(Expr!=null) Expr.setParent(this);
        this.ExprComma=ExprComma;
        if(ExprComma!=null) ExprComma.setParent(this);
    }

    public Expr getExpr() {
        return Expr;
    }

    public void setExpr(Expr Expr) {
        this.Expr=Expr;
    }

    public ExprComma getExprComma() {
        return ExprComma;
    }

    public void setExprComma(ExprComma ExprComma) {
        this.ExprComma=ExprComma;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Expr!=null) Expr.accept(visitor);
        if(ExprComma!=null) ExprComma.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Expr!=null) Expr.traverseTopDown(visitor);
        if(ExprComma!=null) ExprComma.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Expr!=null) Expr.traverseBottomUp(visitor);
        if(ExprComma!=null) ExprComma.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ActParsexp(\n");

        if(Expr!=null)
            buffer.append(Expr.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ExprComma!=null)
            buffer.append(ExprComma.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ActParsexp]");
        return buffer.toString();
    }
}
