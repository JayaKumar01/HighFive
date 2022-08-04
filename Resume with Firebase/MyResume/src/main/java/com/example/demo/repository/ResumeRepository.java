package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.data.entity.Resume;


@Repository
public interface ResumeRepository  extends CrudRepository<Resume,Long> {

}
