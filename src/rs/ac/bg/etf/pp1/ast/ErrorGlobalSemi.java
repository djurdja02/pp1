// generated with ast extension for cup
// version 0.8
// 21/11/2023 14:18:54


package rs.ac.bg.etf.pp1.ast;

public class ErrorGlobalSemi extends Decl {

    public ErrorGlobalSemi () {
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ErrorGlobalSemi(\n");

        buffer.append(tab);
        buffer.append(") [ErrorGlobalSemi]");
        return buffer.toString();
    }
}
