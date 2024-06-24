package com.alee.utils.filefilter;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import java.io.File;

/**
 * @author Mikle Garin
 */

public class SwingFileFilterAdapter extends AbstractFileFilterAdapter
{
    private final FileFilter fileFilter;

    public SwingFileFilterAdapter ( final FileFilter fileFilter, final ImageIcon icon )
    {
        super ( icon, fileFilter.getDescription () );
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