package com.alee.laf.filechooser;

import javax.swing.*;

/**
 * @author Mikle Garin
 */

public enum FileSelectionMode
{
    /**
     * Files only selection mode.
     */
    filesOnly ( JFileChooser.FILES_ONLY ),

    /**
     * Directories only selection mode.
     */
    directoriesOnly ( JFileChooser.DIRECTORIES_ONLY ),

    /**
     * Files and directories selection mode.
     */
    filesAndDirectories ( JFileChooser.FILES_AND_DIRECTORIES );

    /**
     * Selection mode ID in {@link javax.swing.JFileChooser}
     */
    private final int modeId;

    /**
     * Constructs new selection mode enum for the specified mode ID.
     *
     * @param modeId selection mode ID
     */
    private FileSelectionMode ( final int modeId )
    {
        this.modeId = modeId;
    }

    /**
     * Returns selection mode ID.
     *
     * @return selection mode ID
     */
    public int getModeId ()
    {
        return modeId;
    }

    /**
     * Returns selection mode for the specified selection mode ID.
     *
     * @param modeId selection mode ID
     * @return selection mode for the specified selection mode ID
     */
    public static FileSelectionMode get ( final int modeId )
    {
        for ( final FileSelectionMode mode : FileSelectionMode.values () )
        {
            if ( mode.getModeId () == modeId )
            {
                return mode;
            }
        }
        return null;
    }
}