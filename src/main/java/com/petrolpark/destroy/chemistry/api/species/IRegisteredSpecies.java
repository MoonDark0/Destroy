package com.petrolpark.destroy.chemistry.api.species;

import com.petrolpark.destroy.chemistry.api.registry.IRegisteredChemistryObject;

/**
 * @since Destroy 0.1.0
 * @author petrolpark
 */
public interface IRegisteredSpecies extends ISpecies, IRegisteredChemistryObject<IRegisteredSpecies, NamespacedId> {
    
};
