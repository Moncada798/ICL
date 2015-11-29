
public class ASTTwoExpr implements ASTNode{
	
	ASTNode left, right;
	IValue l, r;
	
	public ASTTwoExpr(ASTNode l, ASTNode r){
		this.left = l;
		this.right = r;
	}

	public IValue eval(Environ<IValue> e) throws UndeclaredIdentifierException,DuplicateIdentifierException {
		l = left.eval(e);
		r = right.eval(e);
		return r;
	}

	public Type typeCheck(Environ<Type> env) throws TypeErrorException {
		return right.typeCheck(env);
	}

	public void compile(CodeBlock code, CompilerFrame env)throws UndeclaredIdentifierException, DuplicateIdentifierException {
		left.compile(code, env);
		right.compile(code, env);
	}
	
	public String toString(){
		return left.toString()+" AND "  + right.toString() + " ";
	}

}