package com.alee.utils.filefilter;

import javax.swing.*;
import java.io.File;
import java.io.FileFilter;

/**
 * @author Mikle Garin
 */

public class IOFileFilterAdapter extends AbstractFileFilterAdapter
{
    private final FileFilter fileFilter;

    public IOFileFilterAdapter ( final FileFilter fileFilter, final ImageIcon icon, final String description )
    {
        super ( icon, description );
        this.fileFilter = fileFilter;
    }

    public FileFilter getFileFilter ()
    {
        return fileFilter;
    }

    @Override
    public boolean accept ( final File file )
    {
        return fileFilter == null || fileFilter.accept ( file );
    }
}