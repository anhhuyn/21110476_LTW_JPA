package vn.iotstar.service;

import java.util.List;

import vn.iotstar.entity.Video;

public interface IVideoSerice {

	int count();

	List<Video> findAll(int page, int pageSize);

	List<Video> findByTitle(String title);

	List<Video> findAll();

	Video findById(int videoId);

	void delete(String videoId) throws Exception;

	void update(Video video);

	void insert(Video video);
}
