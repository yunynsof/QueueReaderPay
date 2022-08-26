package hn.com.tigo.queue.listener;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.xml.transform.TransformerFactoryConfigurationError;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Class that allows you to start the process of Read Queue JMS.
 *
 * @author Yuny Rene Rodriguez Perez {@literal<mailto: yrodriguez@hightech-corp.com />}
 * @version  1.0.0
 * @since 08-25-2022 09:19:01 PM 2022
 */
@Singleton
@Startup
public class ReaderQueuePayDaemonThread {


	/** The Constant LOGGER. */
	private static final Logger LOGGER = LogManager.getLogger(ReaderQueuePayDaemonThread.class);


	/** The thread. */
	private Thread thread;

	/** The runnable. */
	ReaderQueuePayMasterThread runnable = null;


	/**
	 * Initialize.
	 */
	@PostConstruct
	public void initialize() {
		try {
			runnable = new ReaderQueuePayMasterThread();
			thread = new Thread(runnable);
			thread.setName("ReaderQueuePayMasterThread_executor");
			thread.start();
			LOGGER.info("ReaderQueuePayMasterThread " + thread.hashCode() + " has been started");
		} catch (TransformerFactoryConfigurationError e) {
			LOGGER.info("Error al instanciar los Hilos: " + e.getMessage());
		}
	}


	/**
	 * Terminate.
	 */
	@PreDestroy
	public void terminate() {
		try {
			runnable.shutdown();
			this.thread.interrupt();
			LOGGER.info("ReaderQueuePayMasterThread " + thread.hashCode() + " has been stopped");
		} catch (Exception e) {
			LOGGER.info("Error al cerrar los Hilos: " + e.getMessage());
		}
	}

	/**
	 * Gets the reader queue master thread.
	 *
	 * @return the reader queue master thread
	 */
	public Thread getReaderQueueMasterThread() {
		LOGGER.info("ReaderQueuePayMasterThread " + thread.hashCode());
		return thread;
	}
}
