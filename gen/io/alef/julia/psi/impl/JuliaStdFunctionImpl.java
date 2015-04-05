// This is a generated file. Not intended for manual editing.
package io.alef.julia.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import io.alef.julia.psi.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class JuliaStdFunctionImpl extends JuliaExpressionImpl implements JuliaStdFunction {

    public JuliaStdFunctionImpl(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof JuliaVisitor) ((JuliaVisitor) visitor).visitStdFunction(this);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public List<JuliaExpression> getExpressionList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, JuliaExpression.class);
    }

    @Override
    @NotNull
    public JuliaFunctionBody getFunctionBody() {
        return findNotNullChildByClass(JuliaFunctionBody.class);
    }

    @Override
    @Nullable
    public JuliaTypeParameters getTypeParameters() {
        return findChildByClass(JuliaTypeParameters.class);
    }

}
