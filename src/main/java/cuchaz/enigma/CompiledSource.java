package cuchaz.enigma;

import org.objectweb.asm.tree.ClassNode;

import javax.annotation.Nullable;

public interface CompiledSource {
	@Nullable
	ClassNode getClassNode(String name);
}
