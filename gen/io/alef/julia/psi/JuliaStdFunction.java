// This is a generated file. Not intended for manual editing.
package io.alef.julia.psi;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface JuliaStdFunction extends JuliaExpression {

    @NotNull
    List<JuliaExpression> getExpressionList();

    @NotNull
    JuliaFunctionBody getFunctionBody();

    @Nullable
    JuliaTypeParameters getTypeParameters();

}
