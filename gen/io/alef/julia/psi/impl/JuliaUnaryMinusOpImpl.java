// This is a generated file. Not intended for manual editing.
package io.alef.julia.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import io.alef.julia.psi.JuliaExpression;
import io.alef.julia.psi.JuliaUnaryMinusOp;
import io.alef.julia.psi.JuliaVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class JuliaUnaryMinusOpImpl extends JuliaExpressionImpl implements JuliaUnaryMinusOp {

    public JuliaUnaryMinusOpImpl(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof JuliaVisitor) ((JuliaVisitor) visitor).visitUnaryMinusOp(this);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public JuliaExpression getExpression() {
        return findChildByClass(JuliaExpression.class);
    }

}
