// This is a generated file. Not intended for manual editing.
package io.alef.julia.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JuliaTypedVariable extends PsiElement {

  @NotNull
  List<JuliaIdentifier> getIdentifierList();

  @Nullable
  JuliaTypeParameters getTypeParameters();

}