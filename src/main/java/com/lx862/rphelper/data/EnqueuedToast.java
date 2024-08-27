package com.lx862.rphelper.data;

import net.minecraft.text.Text;

import org.jetbrains.annotations.Nullable;

import com.lx862.rphelper.config.Config;

public class EnqueuedToast {
    private final Text title;
    private final Text description;
    public EnqueuedToast(Text title, @Nullable Text description) {
        this.title = title;
        this.description = description;
    }

	public CustomToast construct() {
        return new CustomToast(title, description, Config.getDuration(), Config.getErrorTitleColor(), Config.getErrorDescriptionColor(), Config.getErrorTexture(), Config.getIconTexture(), Config.getIconSize(), Config.getWidth(), Config.getHeight());
    }
}
