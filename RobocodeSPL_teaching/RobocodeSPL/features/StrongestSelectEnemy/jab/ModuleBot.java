package jab;

public class ModuleBot extends Module {
	protected SelectEnemy getSelectedSelectEnemy() {		
		return new Strongest(this);
	}
}
