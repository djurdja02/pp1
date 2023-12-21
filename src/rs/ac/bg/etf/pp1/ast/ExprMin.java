// generated with ast extension for cup
// version 0.8
// 21/11/2023 14:18:55


package rs.ac.bg.etf.pp1.ast;

public class ExprMin extends Expr {

    private MinOpt MinOpt;
    private Term Term;
    private AddopOpt AddopOpt;

    public ExprMin (MinOpt MinOpt, Term Term, AddopOpt AddopOpt) {
        this.MinOpt=MinOpt;
        if(MinOpt!=null) MinOpt.setParent(this);
        this.Term=Term;
        if(Term!=null) Term.setParent(this);
        this.AddopOpt=AddopOpt;
        if(AddopOpt!=null) AddopOpt.setParent(this);
    }

    public MinOpt getMinOpt() {
        return MinOpt;
    }

    public void setMinOpt(MinOpt MinOpt) {
        this.MinOpt=MinOpt;
    }

    public Term getTerm() {
        return Term;
    }

    public void setTerm(Term Term) {
        this.Term=Term;
    }

    public AddopOpt getAddopOpt() {
        return AddopOpt;
    }

    public void setAddopOpt(AddopOpt AddopOpt) {
        this.AddopOpt=AddopOpt;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(MinOpt!=null) MinOpt.accept(visitor);
        if(Term!=null) Term.accept(visitor);
        if(AddopOpt!=null) AddopOpt.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(MinOpt!=null) MinOpt.traverseTopDown(visitor);
        if(Term!=null) Term.traverseTopDown(visitor);
        if(AddopOpt!=null) AddopOpt.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(MinOpt!=null) MinOpt.traverseBottomUp(visitor);
        if(Term!=null) Term.traverseBottomUp(visitor);
        if(AddopOpt!=null) AddopOpt.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ExprMin(\n");

        if(MinOpt!=null)
            buffer.append(MinOpt.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Term!=null)
            buffer.append(Term.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(AddopOpt!=null)
            buffer.append(AddopOpt.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ExprMin]");
        return buffer.toString();
    }
}
