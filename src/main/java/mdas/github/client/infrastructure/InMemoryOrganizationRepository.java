package mdas.github.client.infrastructure;

import mdas.github.client.domain.GitOrganization;
import mdas.github.client.domain.OrganizationRepository;

import java.util.HashSet;
import java.util.Set;

public class InMemoryOrganizationRepository implements OrganizationRepository {
    private static final Set<GitOrganization> organizations = new HashSet<>();
}