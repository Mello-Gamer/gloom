// 
// Decompiled by Procyon v0.5.36
// 

package me.zeroeightsix.kami.gui.rgui.component.container.use;

import me.zeroeightsix.kami.gui.rgui.render.theme.Theme;
import me.zeroeightsix.kami.gui.rgui.component.container.AbstractContainer;
import me.zeroeightsix.kami.gui.rgui.util.Docking;

public class Groupbox extends AbstractContainer
{
    String name;
    
    public Groupbox(final Theme theme, final String name) {
        super(theme);
        this.name = name;
    }
    
    public Groupbox(final Theme theme, final String name, final int x, final int y) {
        this(theme, name);
        this.setX(x);
        this.setY(y);
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public boolean isPinned() {
        return false;
    }

    @Override
    public boolean isMinimized() {
        return false;
    }

    @Override
    public Docking getDocking() {
        return null;
    }
}
