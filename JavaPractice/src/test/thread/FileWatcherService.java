package test.thread;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

public class FileWatcherService {

	public static void main(String[] args) throws IOException, InterruptedException {
		WatchService watchService = FileSystems.getDefault().newWatchService();

		Path path = Paths.get("C:\\Users\\Kiran\\JavaPracticeWorkspace\\DSA-Program\\JavaPractice\\src\\test");

		path.register(watchService, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_DELETE,
				StandardWatchEventKinds.ENTRY_MODIFY);

		WatchKey key;
		while ((key = watchService.take()) != null) {
			for (WatchEvent<?> event : key.pollEvents()) {
				System.out.println("Event kind:" + event.kind() + ". File affected: " + event.context() + ".");
			}
			key.reset();
		}
	}
}
