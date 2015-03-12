/*
 * Created on Jun 2, 2004
 *
 * To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package v4lk.lwbd.processing.jflac;

import v4lk.lwbd.processing.jflac.metadata.StreamInfo;
import v4lk.lwbd.processing.jflac.util.ByteData;

/**
 * PCMProcessor interface.
 * This interface defines the signatures for a class to listen
 * to PCM decode events.
 * @author kc7bfi
 */
public interface PCMProcessor {
    /**
     * Called when StreamInfo read.
     * @param streamInfo The FLAC stream info metadata block
     */
    public void processStreamInfo(StreamInfo streamInfo);
    
    /**
     * Called when each data frame is decompressed.
     * @param pcm The decompressed PCM data
     */
    public void processPCM(ByteData pcm);
}
