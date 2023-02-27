package task01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import task01.dao.ParticipantRepository;
import task01.domain.Participant;

@Service
public class ParticipantService {

	@Autowired
	private ParticipantRepository participantRepository;

	public List<Participant> findAllParticipants() {
		return participantRepository.findAllParticipants();
	}

	public Participant getOne(int id) {
		return participantRepository.getOne(id);
	}

	public void save(Participant participant) {
		participantRepository.save(participant);
	}

	public void delete(int id) {
		participantRepository.delete(id);
	}

}