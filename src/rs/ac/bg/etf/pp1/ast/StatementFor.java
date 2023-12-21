// generated with ast extension for cup
// version 0.8
// 21/11/2023 14:18:55


package rs.ac.bg.etf.pp1.ast;

public class StatementFor extends Statement {

    private ForDes ForDes;
    private CondOpt CondOpt;
    private ForDes ForDes1;
    private Statement Statement;

    public StatementFor (ForDes ForDes, CondOpt CondOpt, ForDes ForDes1, Statement Statement) {
        this.ForDes=ForDes;
        if(ForDes!=null) ForDes.setParent(this);
        this.CondOpt=CondOpt;
        if(CondOpt!=null) CondOpt.setParent(this);
        this.ForDes1=ForDes1;
        if(ForDes1!=null) ForDes1.setParent(this);
        this.Statement=Statement;
        if(Statement!=null) Statement.setParent(this);
    }

    public ForDes getForDes() {
        return ForDes;
    }

    public void setForDes(ForDes ForDes) {
        this.ForDes=ForDes;
    }

    public CondOpt getCondOpt() {
        return CondOpt;
    }

    public void setCondOpt(CondOpt CondOpt) {
        this.CondOpt=CondOpt;
    }

    public ForDes getForDes1() {
        return ForDes1;
    }

    public void setForDes1(ForDes ForDes1) {
        this.ForDes1=ForDes1;
    }

    public Statement getStatement() {
        return Statement;
    }

    public void setStatement(Statement Statement) {
        this.Statement=Statement;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ForDes!=null) ForDes.accept(visitor);
        if(CondOpt!=null) CondOpt.accept(visitor);
        if(ForDes1!=null) ForDes1.accept(visitor);
        if(Statement!=null) Statement.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ForDes!=null) ForDes.traverseTopDown(visitor);
        if(CondOpt!=null) CondOpt.traverseTopDown(visitor);
        if(ForDes1!=null) ForDes1.traverseTopDown(visitor);
        if(Statement!=null) Statement.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ForDes!=null) ForDes.traverseBottomUp(visitor);
        if(CondOpt!=null) CondOpt.traverseBottomUp(visitor);
        if(ForDes1!=null) ForDes1.traverseBottomUp(visitor);
        if(Statement!=null) Statement.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("StatementFor(\n");

        if(ForDes!=null)
            buffer.append(ForDes.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(CondOpt!=null)
            buffer.append(CondOpt.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ForDes1!=null)
            buffer.append(ForDes1.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Statement!=null)
            buffer.append(Statement.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [StatementFor]");
        return buffer.toString();
    }
}
