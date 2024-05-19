package dio.lucas.service;

import dio.lucas.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}