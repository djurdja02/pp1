// generated with ast extension for cup
// version 0.8
// 21/11/2023 14:18:55


package rs.ac.bg.etf.pp1.ast;

public class CondFactrelop extends CondFact {

    private Expr Expr;
    private RelOpt RelOpt;

    public CondFactrelop (Expr Expr, RelOpt RelOpt) {
        this.Expr=Expr;
        if(Expr!=null) Expr.setParent(this);
        this.RelOpt=RelOpt;
        if(RelOpt!=null) RelOpt.setParent(this);
    }

    public Expr getExpr() {
        return Expr;
    }

    public void setExpr(Expr Expr) {
        this.Expr=Expr;
    }

    public RelOpt getRelOpt() {
        return RelOpt;
    }

    public void setRelOpt(RelOpt RelOpt) {
        this.RelOpt=RelOpt;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Expr!=null) Expr.accept(visitor);
        if(RelOpt!=null) RelOpt.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Expr!=null) Expr.traverseTopDown(visitor);
        if(RelOpt!=null) RelOpt.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Expr!=null) Expr.traverseBottomUp(visitor);
        if(RelOpt!=null) RelOpt.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("CondFactrelop(\n");

        if(Expr!=null)
            buffer.append(Expr.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(RelOpt!=null)
            buffer.append(RelOpt.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [CondFactrelop]");
        return buffer.toString();
    }
}
