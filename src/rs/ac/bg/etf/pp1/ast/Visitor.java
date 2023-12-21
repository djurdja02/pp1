// generated with ast extension for cup
// version 0.8
// 21/11/2023 14:18:55


package rs.ac.bg.etf.pp1.ast;

public interface Visitor { 

    public void visit(Mulop Mulop);
    public void visit(MethodDecl MethodDecl);
    public void visit(FormList FormList);
    public void visit(Constant Constant);
    public void visit(FactorOr1 FactorOr1);
    public void visit(RelOpt RelOpt);
    public void visit(DDO DDO);
    public void visit(Relop Relop);
    public void visit(Assignop Assignop);
    public void visit(VarD VarD);
    public void visit(FactOpt1 FactOpt1);
    public void visit(MinOpt MinOpt);
    public void visit(NamespaceList NamespaceList);
    public void visit(Addop Addop);
    public void visit(TypeList TypeList);
    public void visit(DSStatementReplace DSStatementReplace);
    public void visit(Factor Factor);
    public void visit(CondTerm CondTerm);
    public void visit(APmaybe APmaybe);
    public void visit(ElseL ElseL);
    public void visit(DeclList DeclList);
    public void visit(ExprL ExprL);
    public void visit(Designator Designator);
    public void visit(Term Term);
    public void visit(ConstD ConstD);
    public void visit(Condition Condition);
    public void visit(ForDes ForDes);
    public void visit(VarDList VarDList);
    public void visit(CondOpt CondOpt);
    public void visit(CondTO CondTO);
    public void visit(DSOpt DSOpt);
    public void visit(Label Label);
    public void visit(Brackets Brackets);
    public void visit(AddopOpt AddopOpt);
    public void visit(ConstDList ConstDList);
    public void visit(VarDeclList VarDeclList);
    public void visit(IdenL IdenL);
    public void visit(Expr Expr);
    public void visit(MulopFOpt MulopFOpt);
    public void visit(ActPars ActPars);
    public void visit(StateL StateL);
    public void visit(NN NN);
    public void visit(DesignatorStatement DesignatorStatement);
    public void visit(DSChoose DSChoose);
    public void visit(CondFactA CondFactA);
    public void visit(Decl Decl);
    public void visit(Assingop Assingop);
    public void visit(Statement Statement);
    public void visit(DesigRep DesigRep);
    public void visit(VarDecl VarDecl);
    public void visit(FormL FormL);
    public void visit(Type Type);
    public void visit(CondFact CondFact);
    public void visit(StaticInitializer StaticInitializer);
    public void visit(DesigRepChoose DesigRepChoose);
    public void visit(ExprComma ExprComma);
    public void visit(Program Program);
    public void visit(MethList MethList);
    public void visit(FormParam FormParam);
    public void visit(DOpt DOpt);
    public void visit(MulopMD MulopMD);
    public void visit(MulopD MulopD);
    public void visit(MulopML MulopML);
    public void visit(AddopM AddopM);
    public void visit(AddopP AddopP);
    public void visit(RelopLE RelopLE);
    public void visit(RelopL RelopL);
    public void visit(RelopBE RelopBE);
    public void visit(RelopB RelopB);
    public void visit(RelopNE RelopNE);
    public void visit(RelopEE RelopEE);
    public void visit(AssignopEq AssignopEq);
    public void visit(LabelIdent LabelIdent);
    public void visit(NoDesigRepChoose NoDesigRepChoose);
    public void visit(DesigRepChooseDot DesigRepChooseDot);
    public void visit(NoDesigRep NoDesigRep);
    public void visit(DesigRepYes DesigRepYes);
    public void visit(DesignatorYes DesignatorYes);
    public void visit(FactorOr12 FactorOr12);
    public void visit(FactorOr11 FactorOr11);
    public void visit(NoFactOpt1 NoFactOpt1);
    public void visit(FactOpt1Yes FactOpt1Yes);
    public void visit(Factor6 Factor6);
    public void visit(Factor5 Factor5);
    public void visit(Factor4 Factor4);
    public void visit(Factor3 Factor3);
    public void visit(Factor2 Factor2);
    public void visit(Factor1 Factor1);
    public void visit(NoMulopFOpt NoMulopFOpt);
    public void visit(MulopFOptYes MulopFOptYes);
    public void visit(Terms Terms);
    public void visit(NoAddopOpt NoAddopOpt);
    public void visit(AddopOptYes AddopOptYes);
    public void visit(NoMinOpt NoMinOpt);
    public void visit(MinOptYes MinOptYes);
    public void visit(ExprMin ExprMin);
    public void visit(RelOptNo RelOptNo);
    public void visit(RelOptYes RelOptYes);
    public void visit(CondFactrelop CondFactrelop);
    public void visit(CondFactANo CondFactANo);
    public void visit(CondFactAYes CondFactAYes);
    public void visit(CondTerms CondTerms);
    public void visit(CondTONo CondTONo);
    public void visit(CondTOYes CondTOYes);
    public void visit(ErrorCond ErrorCond);
    public void visit(Conditioncond Conditioncond);
    public void visit(NoExprCommaexpr NoExprCommaexpr);
    public void visit(ExprCommaexpr ExprCommaexpr);
    public void visit(ActParsexp ActParsexp);
    public void visit(DDONo DDONo);
    public void visit(DDOYes DDOYes);
    public void visit(DOptNo DOptNo);
    public void visit(DOptYes DOptYes);
    public void visit(APmaybeNo APmaybeNo);
    public void visit(APmaybeYes APmaybeYes);
    public void visit(DSChoose4 DSChoose4);
    public void visit(DSChoose3 DSChoose3);
    public void visit(DSChoose2 DSChoose2);
    public void visit(DSChoose1 DSChoose1);
    public void visit(DesignatorStatement2 DesignatorStatement2);
    public void visit(DesignatorStatement1 DesignatorStatement1);
    public void visit(NoCondOpt NoCondOpt);
    public void visit(CondOption CondOption);
    public void visit(NoDSOpt NoDSOpt);
    public void visit(DSOptYes DSOptYes);
    public void visit(NoForDes NoForDes);
    public void visit(ForDesig ForDesig);
    public void visit(ConstantBool ConstantBool);
    public void visit(ConstantChar ConstantChar);
    public void visit(ConstantNUM ConstantNUM);
    public void visit(NoNN NoNN);
    public void visit(NNcomma NNcomma);
    public void visit(NoExprL NoExprL);
    public void visit(ExprLi ExprLi);
    public void visit(NoElseL NoElseL);
    public void visit(ElseLi ElseLi);
    public void visit(ErrorEquals ErrorEquals);
    public void visit(StatementEquals StatementEquals);
    public void visit(StatementDesignatorStatement StatementDesignatorStatement);
    public void visit(StatementBraces StatementBraces);
    public void visit(StatementFor StatementFor);
    public void visit(StatementPrint StatementPrint);
    public void visit(StatementRead StatementRead);
    public void visit(StatementReturn StatementReturn);
    public void visit(StatementContinue StatementContinue);
    public void visit(StatementBreak StatementBreak);
    public void visit(StatementIF StatementIF);
    public void visit(NoIdenL NoIdenL);
    public void visit(IdenLi IdenLi);
    public void visit(Typee Typee);
    public void visit(NoFormL NoFormL);
    public void visit(ErrorFormsComma ErrorFormsComma);
    public void visit(FrmL FrmL);
    public void visit(FormParm FormParm);
    public void visit(NoVarDeclList NoVarDeclList);
    public void visit(VarDeclLst VarDeclLst);
    public void visit(NoFormList NoFormList);
    public void visit(ErrorForms ErrorForms);
    public void visit(FormLst FormLst);
    public void visit(TypeListType TypeListType);
    public void visit(TypeListVoid TypeListVoid);
    public void visit(MthodDecl MthodDecl);
    public void visit(NoMethList NoMethList);
    public void visit(MthList MthList);
    public void visit(NoStateL NoStateL);
    public void visit(StatL StatL);
    public void visit(StaticInitializr StaticInitializr);
    public void visit(NoVarDList NoVarDList);
    public void visit(VrDList VrDList);
    public void visit(NoBrackets NoBrackets);
    public void visit(Brckets Brckets);
    public void visit(VrD VrD);
    public void visit(NoConstDList NoConstDList);
    public void visit(ErrorComma ErrorComma);
    public void visit(CnstDList CnstDList);
    public void visit(CnstD CnstD);
    public void visit(ErrorGlobalSemi ErrorGlobalSemi);
    public void visit(DclVarClass DclVarClass);
    public void visit(DclConstClass DclConstClass);
    public void visit(NoDeclList NoDeclList);
    public void visit(DclList DclList);
    public void visit(NoNamespaceList NoNamespaceList);
    public void visit(NmespaceList NmespaceList);
    public void visit(Prgram Prgram);

}
