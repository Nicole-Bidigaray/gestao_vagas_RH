package com.nicolebidigaray.gestao_vagas.modules.company.usecases;

import com.nicolebidigaray.gestao_vagas.modules.company.entities.JobEntity;
import com.nicolebidigaray.gestao_vagas.modules.company.repositories.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateJobUseCase {

    private final JobRepository jobRepository;

    @Autowired
    public CreateJobUseCase(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    public JobEntity execute(JobEntity jobEntity) {
        return this.jobRepository.save(jobEntity);
    }
}
